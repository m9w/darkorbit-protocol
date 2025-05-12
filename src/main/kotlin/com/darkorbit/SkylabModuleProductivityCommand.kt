package com.darkorbit

interface SkylabModuleProductivityCommand : ProtocolPacket {
	var active: Int
	var bonus: Int
	var efficienty: Int
	var inStorage: Int
	var maxActive: Int
	var robotsLeftTimeList: MutableList<SkylabActiveRobotsLeftTimeCommand>
	var type1Price: SkylabRobotPriceCommand
	var type2Price: SkylabRobotPriceCommand
}
