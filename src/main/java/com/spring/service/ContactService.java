package com.spring.service;

import java.util.List;
import java.util.Optional;

import com.spring.domain.Contact;

public interface ContactService {

    Iterable<Contact> findAll();

    List<Contact> search(String q);

    Optional<Contact> findOne(int id);

    void save(Contact contact);

    void delete(int id);

}