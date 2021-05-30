package com.hrav.controller;


import com.hrav.model.Location;
import com.hrav.payload.ApiResponse;
import com.hrav.repository.LocationRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Morteza Vesal
 */

@RestController
@RequestMapping("/api/location")
@Api(value = "/api/location", produces = "application/json")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;

    @PostMapping("/add")
//    @ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, paramType = "header", example = "Bearer access_token")
    public ResponseEntity<ApiResponse> addNewLocation(@Valid @RequestBody Location location) {

//        Doctor doc = doctorService.findByUsername(currentUser.getUsername());
//
//        location.setDoctor(doc);
//
//        locationService.addLocation(location);

        locationRepository.save(location);

        return new ResponseEntity(new ApiResponse(true, "Location is registered successfully."),
                HttpStatus.OK);
    }
}
