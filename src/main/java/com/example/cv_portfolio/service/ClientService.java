package com.example.cv_portfolio.service;

import com.example.cv_portfolio.model.Client;
import com.example.cv_portfolio.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }



    public void addClient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void editClient(Client newClient) {
        clientRepository.save(newClient);
    }

    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
