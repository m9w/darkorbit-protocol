package com.darkorbit

interface TrainingGroundRemainingTimeToTimeoutCommand : ProtocolPacket {
	var remainingMillisecondsToTimeout: Int
}
