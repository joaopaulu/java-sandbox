package com.okta.developer.jugtours.resource;

import com.okta.developer.jugtours.model.Group;
import com.okta.developer.jugtours.repository.GroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class GroupResource {

    private final Logger log = LoggerFactory.getLogger(GroupResource.class);
    private final GroupRepository groupRepository;

    public GroupResource(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    @GetMapping("/groups")
    Collection<Group> groups(){
        return groupRepository.findAll();
    }

}
