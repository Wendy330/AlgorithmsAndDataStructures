package throttlingGateway;

import java.util.*;


class Result {

    /*
     * Complete the 'droppedRequests' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY requestTime as parameter.
     */

    public static int droppedRequests(List<Integer> requestTime) {
        // Write your code here
        int totalDroppedRequests = 0;

        for(int i = 0; i < requestTime.size(); i++) {
            if (i > 2 && requestTime.get(i).equals(requestTime.get(i - 3))) {
                totalDroppedRequests++;
            } else if (i > 19 && requestTime.get(i) - requestTime.get(i - 20) < 10) {
                totalDroppedRequests++;
            } else if (i > 59 && requestTime.get(i) - requestTime.get(i - 60) < 60) {
                totalDroppedRequests++;
            }
        }

        return totalDroppedRequests;
    }

}


