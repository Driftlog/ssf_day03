package sg.edu.nus.iss.ssf_day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.ssf_day03.model.Contact;

@Controller
@RequestMapping(path = "/")
public class AddressBookController {

    // request method to load landing page
    @GetMapping
    public String showAddressBook(Model model) {
        model.addAttribute("contact", new Contact());
        return "addressBook";
    }

    // post
    // request method to load landing page
    //saving contact info
    @PostMapping("/contact")
    public String saveAddressBook(Contact contact, Model model) {

        System.out.println("Name: " + contact.getName());
        System.out.println("Name: " + contact.getEmail());
        System.out.println("Phone Number: " + contact.getPhoneNo());
        return "addressBook";
    }

}
