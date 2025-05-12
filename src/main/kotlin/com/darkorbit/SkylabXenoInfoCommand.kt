package com.darkorbit

interface SkylabXenoInfoCommand : ProtocolPacket {
	var activeConsumption: Int
	var activeEfficiency: Int
	var activeEnergy: Int
	var inactiveConsumption: Int
}
