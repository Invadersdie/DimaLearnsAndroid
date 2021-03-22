package com.example.dimalearnsandroid

import javax.inject.Inject

class PlusUseCase @Inject constructor(calc:Calc):(Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1+p2
    }
}