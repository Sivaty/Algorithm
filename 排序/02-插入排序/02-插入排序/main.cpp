//
//  main.cpp
//  02-插入排序
//
//  Created by ShuaiBin on 2018/11/5.
//  Copyright © 2018年 ShuaiBin. All rights reserved.
//

#include <iostream>
#include <string>
using namespace std;

void sortArray(int array[]){
    
    int j = 0;
    for (int i = 1; i< 5; i++) {
        int temp = array[i];
        for (j = i; j > 0 && temp < array[j-1]; j--) {
            array[j] = array[j-1];
        }
        array[j]= temp;
    }
    
    for (int i = 0; i< 5; i++) {
        cout << array[i] << endl;
    }
}

int main(int argc, const char * argv[]) {
    // insert code here...
    
    int array[] = {3, 2, 45, 23, 98, 0};
    sortArray(array);
    
    return 0;
}
