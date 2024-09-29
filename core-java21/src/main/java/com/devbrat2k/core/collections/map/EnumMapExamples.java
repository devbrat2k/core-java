package com.devbrat2k.core.collections.map;

import java.util.EnumMap;
import java.util.Map;

import static com.devbrat2k.core.collections.map.Direction.EAST;

public class EnumMapExamples {
  public static void main(String[] args) {
    EnumMap<Direction, Boolean> allowedDirectionsMap = new EnumMap<>(Direction.class);

    allowedDirectionsMap.put(Direction.EAST, true);
    allowedDirectionsMap.put(null, true);


    EnumMap<Direction, Boolean> newMap = new EnumMap<>(allowedDirectionsMap);

    EnumMap<Direction, Boolean> newMapFromAnotherMap = new EnumMap<>(Map.of(Direction.EAST, true));
  }
}

enum Direction {
  EAST, WEST, NORTH, SOUTH
}
