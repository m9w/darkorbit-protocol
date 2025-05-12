package com.darkorbit

interface TrainingGroundStatusCommand : ProtocolPacket {
	var statusData: TrainingGroundStatusDataModule
	var statusType: TrainingGroundStatusType
}
