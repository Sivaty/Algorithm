//
//  main.cpp
//  04-快速排序
//
//  Created by SivatiMac on 2018/11/9.
//  Copyright © 2018年 SivatiMac. All rights reserved.
//

#include <iostream>
#include <vector>
using namespace std;

//选择排序
void selectionSort(vector<int> array) {
    int minIndex = 0;
    int temp = 0;
    for (int i = 0; i < array.size(); ++i) {
        minIndex = i;
        for (int j = i+1; j < array.size(); ++j) {
            if (array[minIndex] > array[j]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    for (int i = 0; i < array.size(); ++i) {
        cout << array[i] << endl;
    }
}


//冒泡排序
void bubbleSort(vector<int> array){
    for (int i = 0; i < array.size() - 1 ; ++i) {
        for (int j = 0; j < array.size() - 1 - i; j++) {
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    for (int i = 0; i < array.size(); ++i) {
        cout << array[i] << endl;
    }
}


//快速排序
void quickSort(int array[], int lowIndex, int highIndex){
    if (lowIndex >= highIndex) {
        return;
    }
    int first = lowIndex;
    int last = highIndex;
    int key = array[first];
    
    while (first < last) {
        while (first < last && array[last] >= key) {
            --last;
        }
        array[first] = array[last];
        
        while (first < last && array[first] <= key) {
            ++first;
        }
        array[last] = array[first];
    }
    array[first] = key;
    quickSort(array, lowIndex, first - 1);
    quickSort(array, first +1, highIndex);
}


int main(int argc, const char * argv[]) {
    // insert code here...
    vector<int> array = {2, 1, 6, 12, 8, 53,74};
    int array1[] = {10, 2, 1, 6, 12, 8, 53};
//    selectionSort(array);
//    bubbleSort(array);
    quickSort(array1, 0 ,sizeof(array1) / sizeof(array1[0]) - 1);
    
    for(int i = 0; i < 7; i++)
    {
        cout << array1[i] << " ";
    }
    
    return 0;
}

void quickSort2(int array[], int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) {
        return;
    }
    int first = lowIndex;
    int last = highIndex;
    int key = array[first];
    while (first < last) {
        while (first < last && array[last] >= key) {
            --last;
        }
        array[first] = array[last];
        while (first < last && array[first] <= key) {
            ++first;
        }
        array[last] = array[first];
    }
    array[first] = key;
    quickSort2(array, lowIndex, first - 1);
    quickSort2(array, first + 1, highIndex);
}
