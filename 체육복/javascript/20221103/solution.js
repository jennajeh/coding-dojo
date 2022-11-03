export default function solution(n, lost, reserve) {
  const realLost = lost.sort((a, b) => a - b).filter((el) => !reserve.includes(el));
  let realReserve = reserve.sort((a, b) => a - b).filter((el) => !lost.includes(el));

  const finalStudent = realLost.filter((lostEl) => {
    const abs = realReserve.find((reserveEl) => Math.abs(lostEl - reserveEl) === 1);

    if (!abs) {
      return true;
    }

    realReserve = realReserve.filter((reserveEl) => reserveEl !== abs);
  });

  const answer = n - finalStudent.length;

  return answer;
}
