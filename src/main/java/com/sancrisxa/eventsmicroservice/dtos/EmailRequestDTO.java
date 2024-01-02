package com.sancrisxa.eventsmicroservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
