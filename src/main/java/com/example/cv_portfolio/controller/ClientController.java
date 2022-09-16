package com.example.cv_portfolio.controller;

import com.example.cv_portfolio.model.Client;
import com.example.cv_portfolio.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping("/contact")
    public RedirectView addClientToContact(@ModelAttribute Client client) {
        clientService.addClient(client);
        return new RedirectView("/contact");
    }
}
