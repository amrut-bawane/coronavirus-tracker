package com.sweetjesus.coronavirustracker.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LocationStats {
    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;
}
