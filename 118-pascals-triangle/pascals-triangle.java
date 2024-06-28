class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        if(numRows == 1){
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            newRow.add(1);
        }

        for(int i = 1; i < numRows - 1; i++){
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows -2).get(i));
        } //numRows - 2 because for row 3 (numRows = 3) which is at index 2 in our prevRows List,
        // numRows - 1 => will be again 2. Thus we have to subtract by 2.

        prevRows.add(newRow);

        return prevRows;
    }
}