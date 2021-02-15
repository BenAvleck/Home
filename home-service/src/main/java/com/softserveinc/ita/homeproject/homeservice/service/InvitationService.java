package com.softserveinc.ita.homeproject.homeservice.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.softserveinc.ita.homeproject.homeservice.dto.InvitationDto;

public interface InvitationService {

    InvitationDto createInvitation(InvitationDto invitation);

    void changeInvitationStatus(Long id);

    InvitationDto getInvitation(Long id);

    List<InvitationDto> getAllActiveInvitations();

    void updateSentDateTime(Long id, LocalDateTime dateTime);

}