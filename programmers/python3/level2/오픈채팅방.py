def solution(record):
    answer = []
    dic = {}
    
    for mes in record:
        tmp = mes.split(" ")
        if tmp[0]=="Enter" or tmp[0]=="Change":
            dic[tmp[1]] = tmp[2]
    
    for mes in record:
        tmp = mes.split(" ")
        if tmp[0] =="Enter":
            answer.append("{}님이 들어왔습니다.".format(dic[tmp[1]]))
        elif tmp[0] =="Leave":
            answer.append("{}님이 나갔습니다.".format(dic[tmp[1]]))  
        else:
            pass
    
    return answer