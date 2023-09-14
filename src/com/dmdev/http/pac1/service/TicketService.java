package com.dmdev.http.pac1.service;

import com.dmdev.http.pac1.dao.TicketDao;
import com.dmdev.http.pac1.dto.TicketDto;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TicketService {

    private static final TicketService INSTANCE = new TicketService();

    private final TicketDao ticketDao = TicketDao.getInstance();

    private TicketService() {
    }

    public List<TicketDto> findAllByFlightId(Long flightId) {
        return ticketDao.findAllByFlightId(flightId).stream()
                .map(ticket -> TicketDto.builder()
                                .id(ticket.getId())
                                .flightId(ticket.getFlightId())
                                .seatNo(ticket.getSeatNo())
//                        ticket.getId(),
//                        ticket.getFlightId(),
//                        ticket.getSeatNo()
                          .build()
                )
                .collect(toList());
    }

    public static TicketService getInstance() {
        return INSTANCE;
    }
}
