package com.darkorbit

interface SkylabMainViewModuleCommand : ProtocolPacket {
	var currentPower: Int
	var efficiency: Int
	var level: Int
	var maxLevel: Int
	var maxPower: Int
	var moduleType: String
	var state: String
}
