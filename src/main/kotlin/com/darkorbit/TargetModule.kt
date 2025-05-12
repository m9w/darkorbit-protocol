package com.darkorbit

interface TargetModule : PlayerAttributeModule {
	var health: HealthModule
	var name: String
	var shipType: ShipIconModule
}
