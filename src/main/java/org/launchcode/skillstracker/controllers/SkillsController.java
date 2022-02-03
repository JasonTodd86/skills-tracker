package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping()
    public String helloSkills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h1>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String form() {
        return
//                     Name form input
                "<html>" +
                        "<body>" +
                        "<form action='/form' method='POST'>" +
                        "<label for='name'>Name:</label><br>" +
                        "<input type='text' id='name' name='name'><br>" +
//                        "</form>" +
//                      Favorite language select
                        "<label for='languages'>My favorite language: </label><br>" +
                        "<select name='lang1' id='lang1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
//                        "</form>" +
//                      Second favorite language select
                        "<label for='languages'>My second favorite language: </label><br>" +
                        "<select name='lang2' id='lang2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
//                        "</form>" +
//                      Third favorite language select
                        "<label for='languages'>My third favorite language: </label><br>" +
                        "<select name='lang3' id='lang3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br><br>" +
                        "<input type='submit' value='Submit'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
    }

    @RequestMapping(value = "form", method = {RequestMethod.POST})
    @ResponseBody
    public String form(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        return
                "<html>" +
                        "<h1>" + name + "</h1>" +
                        "<table>" +
                            "<tr>" +
                                "<th>Favorite</th>" +
                                "<th>Second Favorite</th>" +
                                "<th>Third Favorite</th>" +
                            "</tr>" +
                            "<tr>" +
                                "<td>" + lang1 + "</td>" +
                                "<td>" + lang2 + "</td>" +
                                "<td>" + lang3 + "</td>" +
                            "</tr>" +
                        "</table>" +
//                        "<ol>" +
//                        "<li>" + lang1 + "</li>" +
//                        "<li>" + lang2 + "</li>" +
//                        "<li>" + lang3 + "</li>" +
//                        "</ol>" +

                "</html>";
    }


}



