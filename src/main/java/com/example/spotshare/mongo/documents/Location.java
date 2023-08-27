package com.example.spotshare.mongo.documents;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {
    BigDecimal lat;
    BigDecimal lng;
}
