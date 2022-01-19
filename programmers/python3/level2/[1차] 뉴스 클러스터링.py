def transform(strr):
    strr = strr.upper()
    strr_candidate = []
    
    for i in range(1,len(strr)):
        temp = strr[i-1:i+1]
        if temp.isalpha():
            strr_candidate.append(temp)
    
    # print("strr_candidate=",strr_candidate)
    return strr_candidate

def solution(str1, str2):
    
    st1 = transform(str1)
    st2 = transform(str2)

    st1_int_st2 = []
    temp = st2
    for i in st1:
        if i in temp:
            st1_int_st2.append(i)
            temp.remove(i)
    # print("st1_int_st2=",st1_int_st2)

    st1_uni_st2 = st1+st2
    # print("st1_uni_st2=",st1_uni_st2)
    # for i in st1_int_st2:
    #     st1_uni_st2.remove(i)
    
    if len(st1_uni_st2)==0:
          return 65536

    answer = int(len(st1_int_st2)/len(st1_uni_st2)*65536)
    return answer

# str1 = "FRANCE"
# str2 = "french"
# solution(str1, str2)

# str1 = "aa1+aa2"	
# str2 = "AAAA12"
# solution(str1, str2)

# str1 = "E=M*C^2"	
# str2 = "e=m*c^2"
# solution(str1, str2)