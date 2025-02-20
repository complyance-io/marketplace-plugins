package complyance.marketplace.plugins.cloudbeds.model;

import java.time.LocalDate;

public record Reservation(
    String id,
    String guestName,
    LocalDate checkIn,
    LocalDate checkOut,
    String status,
    String roomType
) {} 