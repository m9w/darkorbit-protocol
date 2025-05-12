package com.darkorbit

interface EternalBlacklightInfoCommand : ProtocolPacket {
	var boosterInfoCommand: EternalBlacklightBoosterInfoCommand
	var cpuInfoCommand: EternalBlacklightCpuInfoCommand
	var waveInfo: EternalBlacklightWaveInfoCommand
}
