package com.adasoraninda.explorcali.domain;

public enum Region {
    Central_Coast("Central Coast"),
    Southern_California("Southern California"),
    Northern_California("Northern California"),
    Varies("Varies");

    private final String label;

    Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label) {

//        return Arrays.stream(Region.values())
//                .filter(r -> r.label.equalsIgnoreCase(label))
//                .findFirst()
//                .orElse(null);

        for (Region r : Region.values()) {
            if (r.label.equalsIgnoreCase(label)) {
                return r;
            }
        }
        return null;
    }

}
