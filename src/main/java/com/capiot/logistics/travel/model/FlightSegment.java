package com.capiot.logistics.travel.model;

import java.time.ZonedDateTime;

public class FlightSegment {
	
	private String segmentID;
	
	private String originCode;
	
	private String destinationCode;
	
	private String originName;
	
	private String destinationName;
	
	private ZonedDateTime startTime;
	
	private ZonedDateTime endTime;
	
	private String airlinePNR;	
}