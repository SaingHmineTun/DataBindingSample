package it.saimao.databinding.model;

public record User(
        String firstName,
        String lastName,
        Integer age,
        Boolean loggedIn
) {
}
