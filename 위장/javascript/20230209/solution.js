function solution(clothes) {
    let answer = 1;

    // 종류별로 의상 개수 카운팅   
    // ----- 결과 예시 -----
    // 얼굴 : [안경, 썬글라스, 착용안함]
    // 상의 : [반팔, 긴팔, 착용안함]
    // 하의 : [반바지, 긴바지, 착용안함]
    // 겉옷 : [짧은 코트, 긴 코트, 착용안함]
    // 3 * 3 * 3 * 3 - 1
    const cloth = clothes.reduce((prev, curr) => {
        prev[curr[1]] = (prev[curr[1]] || 1) + 1;
        
        return prev;
    }, {});

    // 각 종류의 의상 개수를 곱해준다
    for (let key in cloth) {
        answer *= cloth[key];
    }

    // 아무것도 착용하지 않는 경우는 없으므로, -1을 해준다
    return answer - 1;
}
