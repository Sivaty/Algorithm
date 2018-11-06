//
//  main.cpp
//  希尔排序(缩减增量排序)
//
//  Created by ShuaiBin on 2018/11/5.
//  Copyright © 2018年 ShuaiBin. All rights reserved.
//

#include <iostream>
#include <vector>
using namespace std;

template <typename CompareNumber>
void shellSort(vector<CompareNumber> & array ) {
    for (int gap = array.size()/2; gap > 0; gap /=2) {
        for (int i = gap; i < array.size(); ++i) {
            int temp = array[gap];
            int j = i;
            for (; j >0 && temp < array[j-gap]; j -= gap) {
                array[j] = array[j-gap];
            }
            array[j] = temp;
        }
    }
}


int main(int argc, const char * argv[]) {
    // insert code here...
    vector<int> array = {2, 4, 3, 1, 18, 94, 23, 34, 12, 45};
    
   
    return 0;
}
