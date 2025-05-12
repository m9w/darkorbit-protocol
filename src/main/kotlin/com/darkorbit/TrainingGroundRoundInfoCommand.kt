package com.darkorbit

interface TrainingGroundRoundInfoCommand : ProtocolPacket {
	var roundIndex: Int
	var statusType: TrainingGroundRondStatusType
}
