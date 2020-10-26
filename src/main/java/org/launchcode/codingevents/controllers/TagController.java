package org.launchcode.codingevents.controllers;


import org.launchcode.codingevents.data.TagRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.launchcode.codingevents.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller                                                 // step 1 ID the controller
@RequestMapping("tag")                                      // step 2 set the address mapping
public class TagController {

    @Autowired                                              // step 3 link to the repository
    private TagRepository tagRepository;                    // repository is easy to make

    @GetMapping
    public String displayAllTags(Model model) {
        model.addAttribute("title", "All Tags");
        model.addAttribute("tags", tagRepository.findAll());
        return "tag/index";
    }

    @GetMapping("create")
    public String renderCreateTagForm(Model model) {
        model.addAttribute("title", "Create Tag");
        model.addAttribute(new Tag());
        return "tag/create";
    }

    @PostMapping("create")
    public String processCreateTagForm(@Valid @ModelAttribute Tag tag,
                                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Tag");
            model.addAttribute(new Tag());
            return "tag/create";
        }

        tagRepository.save(tag);
        return "redirect:";
    }

                                                               // step 5 copy paste tag from "eventcategory?"

}
