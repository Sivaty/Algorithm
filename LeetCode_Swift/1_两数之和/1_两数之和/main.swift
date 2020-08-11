//
//  main.swift
//  1_两数之和
//
//  Created by Link on 2020/7/25.
//  Copyright © 2020 Link. All rights reserved.
//  https://leetcode-cn.com/problems/two-sum/

import Foundation

func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    var indexArray = [Int]()
    var numsMap: [Int: Int] = [:]
    for (index, item) in nums.enumerated() {
        if let otherIndex = numsMap[target - item] {
            indexArray.append(otherIndex)
            indexArray.append(index)
            break
        }
        numsMap[item] = index
    }
    return indexArray
}

let indexArray = twoSum([2,7,11,15], 9)
print(indexArray)
