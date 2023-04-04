package com.example.restful.example.controller;

import com.example.restful.example.model.Client;
import com.example.restful.example.model.Item;
import com.example.restful.example.model.Order;
import com.example.restful.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }



    //post

    @PostMapping(value = "/clients")
    public ResponseEntity<?> create(@RequestBody Client client) {
        clientService.create(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/clients/{id}/orders")
    public ResponseEntity<?> createOrder(@RequestBody Order order, @PathVariable(name = "id") int id) {
        clientService.createOrder(order,id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/clients/{id}/orders/{id_order}/items")
    public ResponseEntity<?> createItem(@RequestBody Item item, @PathVariable(name = "id") int id, @PathVariable(name = "id_order") int id_order) {
        clientService.createItem(item,id,id_order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }



    //get

    @GetMapping(value = "/clients")
    public ResponseEntity<List<Client>> read() {
        final List<Client> clients = clientService.readAll();

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<Client> read(@PathVariable(name = "id") int id) {
        final Client client = clientService.read(id);

        return client != null
                ? new ResponseEntity<>(client, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/clients/{id}/orders")
    public ResponseEntity<List<Order>> readOrders(@PathVariable(name = "id") int id) {

        final List<Order> orders = clientService.readAllOrders(id);

        return orders != null
                ? new ResponseEntity<>(orders, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping(value = "/clients/{id}/orders/{id_order}")
    public ResponseEntity<Order> readOrders(@PathVariable(name = "id") int id,@PathVariable(name = "id_order") int id_order) {

        final Order order = clientService.readOrders(id,id_order);

        return order != null
                ? new ResponseEntity<>(order, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping(value = "/clients/{id}/orders/{id_order}/items")
    public ResponseEntity<List<Item>> readItems(@PathVariable(name = "id") int id,@PathVariable(name = "id_order") int id_order) {

        final List<Item> items = clientService.readAllItems(id, id_order);

        return items != null
                ? new ResponseEntity<>(items, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping(value = "/clients/{id}/orders/{id_order}/items/{id_item}")
    public ResponseEntity<Item> readItems(@PathVariable(name = "id") int id,@PathVariable(name = "id_order") int id_order,@PathVariable(name = "id_item") int id_item) {

        final Item item = clientService.readItems(id,id_order,id_item);

        return item != null
                ? new ResponseEntity<>(item, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }



    //put

    @PutMapping(value = "/clients/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Client client) {
        final boolean updated = clientService.update(client, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PutMapping(value = "/clients/{id}/orders/{id_order}")
    public ResponseEntity<?> updateOrder(@PathVariable(name = "id") int id, @RequestBody Order order,@PathVariable(name = "id_order") int id_order) {
        final boolean updated = clientService.updateOrder(order,id,id_order);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PutMapping(value = "/clients/{id}/orders/{id_order}/items/{id_item}")
    public ResponseEntity<?> updateItem(@PathVariable(name = "id") int id, @RequestBody Item item,@PathVariable(name = "id_order") int id_order,@PathVariable(name = "id_item") int id_item) {
        final boolean updated = clientService.updateItem(item,id,id_order,id_item);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }


    //delete


    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = clientService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/clients/{id}/orders/{id_order}")
    public ResponseEntity<?> deleteOrder(@PathVariable(name = "id") int id,@PathVariable(name = "id_order") int id_order) {
        final boolean deleted = clientService.deleteOrder(id,id_order);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/clients/{id}/orders/{id_order}/items/{id_item}")
    public ResponseEntity<?> deleteItem(@PathVariable(name = "id") int id,@PathVariable(name = "id_order") int id_order,@PathVariable(name = "id_item") int id_item) {
        final boolean deleted = clientService.deleteItem(id,id_order,id_item);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}