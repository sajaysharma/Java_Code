public static List<Integer> getStaleSkillCount(int numSkills, List<List<Integer>> requestLogs,
                                               List<Integer> queryTimes, int timeWindow) {
    Map<Integer, List<Integer>> skillMap = new HashMap<>();

    for (List<Integer> log : requestLogs) {
        int skillId = log.get(0);
        int timeStamp = log.get(1);

        if (!skillMap.containsKey(skillId)) {
            skillMap.put(skillId, new ArrayList<>());
        }
        skillMap.get(skillId).add(timeStamp);
    }

    for (List<Integer> times : skillMap.values()) {
        Collections.sort(times);
    }

    List<Integer> result = new ArrayList<>();

    for (int queryTime : queryTimes) {
        int startTime = queryTime - timeWindow;
        int activeSkills = 0;

        for (int skill = 1; skill <= numSkills; skill++) {
            List<Integer> timestamps = skillMap.getOrDefault(skill, new ArrayList<>());

            int idx = Collections.binarySearch(timestamps, startTime);
            if (idx < 0) idx = -idx - 1;

            if (idx < timestamps.size() && timestamps.get(idx) <= queryTime) {
                activeSkills++;
            }
        }

        result.add(numSkills - activeSkills);
    }

    return result;
}