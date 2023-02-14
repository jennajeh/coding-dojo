function solution(s) {
  const subsets = s.substring(1, s.length-2).split('},')  // 결과 : [ '{1,2,3', '{2,1', '{1,2,4,3', '{2' ]
    .map(str=>str.substring(1).split(',')  // 결과 :  [['1', '2', '3'], ['2', '1'], ['1', '2', '4', '3'], ['2']]
      .map(v=>Number(v)));  // 결과 : [[1, 2, 3], [2, 1], [1, 2, 4, 3], [2]]

  // 각 부분집합의 길이 순으로 정렬    
  // 두 원소 a, b를 비교했을 때 음수를 반환하면 a가 앞으로, 양수를 반환하면 b가 앞으로
  subsets.sort((a, b) => a.length - b.length);

  const ans = subsets.reduce((acc, subset) => {
      // subset에서 acc(정답 배열)의 모든 원소를 제거하면 하나의 원소가 남음
      const value = subset.filter(v => !acc.includes(v))[0];
      // 그렇게 남은 원소를 acc에 추가
      acc.push(value);
      return acc;
  }, []);
  
  return ans;
}
