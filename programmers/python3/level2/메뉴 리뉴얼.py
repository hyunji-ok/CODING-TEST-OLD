from itertools import combinations

def solution(orders, course):

    answer = []
    
    for i in course:
        order_dic = {}
        
        for order in orders:
            order = sorted(order)
            for com in list(combinations(order,i)):
                com = list(com)
                temp = "".join(com)
                if temp in order_dic:
                    order_dic[temp]+=1
                else:
                    order_dic[temp]=1
        # print(order_dic)
        
        for order_dic_items in order_dic.items():
            order_dic_values_max = max(order_dic.values())
            if order_dic_items[1] == order_dic_values_max and order_dic_items[1]>1:
                answer.append(order_dic_items[0])
    
    answer.sort()

    return answer

# orders = ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
# course = [2,3,4]
# solution(orders, course)


# orders = ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]
# course = [2,3,5]
# solution(orders, course)
