Set<Integer> set = new TreeSet<>();
for (int i = 0; i < 1000; i++) {
    if (set.contains(i)) {
        continue;
    }

    int inv = inverter(i);
    if ((i + inv) % 2 != 0) {
        set.add(i);
        if (i == inverter(inv)) {
            set.add(inv);
        }
    }
}
for (Integer i : set) {
    System.out.println(i);
}