//
//  main.swift
//  汉诺塔问题
//
//  Created by Link on 2020/7/26.
//  Copyright © 2020 Link. All rights reserved.
//  https://leetcode-cn.com/problems/hanota-lcci/

import Foundation

//将n-1个盘子从a移到b
//将最后一个盘子从a移到c
//将n-1个盘子从b移到c

func hanota( _ A: inout [Int], _ B: inout [Int], _ C: inout [Int]) {
    if A.count == 1, let last = A.last {
        A.removeLast()
        C.append(last)
    }
    
    
}

