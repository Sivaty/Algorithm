//
//  main.cpp
//  01-递归
//
//  Created by ShuaiBin on 2018/10/31.
//  Copyright © 2018年 ShuaiBin. All rights reserved.
//

#include <iostream>
using namespace std;

void output(int number){
    if (number > 10) {
        output(number/10);
    }
    cout << "number is " << number%10 << endl;
}

int main(int argc, const char * argv[]) {
    // insert code here...
    output(345621);
    return 0;
}
