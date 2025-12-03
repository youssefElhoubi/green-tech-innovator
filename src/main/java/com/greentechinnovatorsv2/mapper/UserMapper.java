package com.greentechinnovatorsv2.mapper;

import com.greentechinnovatorsv2.dto.UserRequestDTO;
import com.greentechinnovatorsv2.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    // MapStruct detects the Lombok @Builder on the DTO automatically
    UserRequestDTO toDTO(User user);

    // MapStruct uses the Lombok Setters on the Entity automatically
    @Mapping(target = "id", ignore = true) // MongoDB generates the ID
    @Mapping(target = "image", ignore = true) // Not in request
    User toEntity(UserRequestDTO userRequestDTO);
}
