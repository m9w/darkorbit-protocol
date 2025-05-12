package com.darkorbit

interface PerformanceTrackingSendInfoRequest : ProtocolPacket {
	var fps: Int
	var memoryUsage: Int
	var optionalPerformanceValues: MutableList<Int>
	var version: String
}
