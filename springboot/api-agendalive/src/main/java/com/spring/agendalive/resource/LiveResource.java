package com.spring.agendalive.resource;

import com.spring.agendalive.model.Live;
import com.spring.agendalive.repository.LiveRepository;
import com.spring.agendalive.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.Optional;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/lives")
public class LiveResource {

    @Autowired
    private LiveRepository liveRepository;

    @Autowired
    private LiveService liveService;

    @GetMapping
    public ResponseEntity<Page<Live>> getAllLives(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                  @RequestParam(required = false) String flag){
        Page<Live> livePage = liveService.findAll(pageable, flag);
        if(livePage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<Page<Live>>(livePage, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Live> buscarPeloCodigo(@PathVariable Long id) {
        Optional<Live> pessoa = this.liveRepository.findById(id);
        return pessoa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Live> criar(@RequestBody Live live, HttpServletResponse response) {
        Live liveSalva = liveRepository.save(live);
        return ResponseEntity.status(HttpStatus.CREATED).body(liveSalva);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        liveRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Live> atualizar(@PathVariable Long id, @RequestBody Live pessoa){
        Live liveSalva = liveService.atualizar(id, pessoa);
        return ResponseEntity.ok(liveSalva);
    }
}
