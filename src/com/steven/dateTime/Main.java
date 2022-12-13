package com.steven.dateTime;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

import static java.time.LocalDate.of;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Main {
    static int years = 80;
    public static final class Period implements ChronoPeriod
    , Serializable {

        @Override
        public long get(TemporalUnit unit) {
            return 0;
        }

        @Override
        public List<TemporalUnit> getUnits() {
            return null;
        }

        @Override
        public Chronology getChronology() {
            return null;
        }

        @Override
        public ChronoPeriod plus(TemporalAmount amountToAdd) {
            return null;
        }

        @Override
        public ChronoPeriod minus(TemporalAmount amountToSubtract) {
            return null;
        }

        @Override
        public ChronoPeriod multipliedBy(int scalar) {
            return null;
        }

        @Override
        public ChronoPeriod normalized() {
            return null;
        }

        @Override
        public Temporal addTo(Temporal temporal) {
            return null;
        }

        @Override
        public Temporal subtractFrom(Temporal temporal) {
            return null;
        }
    }
    public static void main(String[] args) {
        LocalDate date = of(1976, 11, 3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(date.format(formatter));
        System.out.println(date.plus(years, YEARS).format(formatter));

        Instant epoch = Instant.EPOCH;
        System.out.println(epoch.plus(1000000, HOURS));

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.plus(24, HOURS).format(formatter));
    }
}