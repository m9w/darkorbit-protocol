package com.darkorbit

interface HealthModule : PlayerAttributeModule {
	var hp: Long
	var hpMax: Long
	var nanoHull: Int
	var nanoHullMax: Int
	var shield: Int
	var shieldMax: Int
}
