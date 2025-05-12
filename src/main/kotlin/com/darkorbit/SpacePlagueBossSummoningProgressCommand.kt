package com.darkorbit

interface SpacePlagueBossSummoningProgressCommand : ProtocolPacket {
	var bossCounter: SpacePlagueCounterDataModule
	var minionsCounter: SpacePlagueCounterDataModule
	var waveGroup: SpacePlagueBossSummoningWaveGroupType
}
