package com.darkorbit

interface TeamDeathMatchResultScreenPlayerModule : ProtocolPacket {
	var deaths: Int
	var kills: Int
	var name: String
	var peakDamageGiven: Int
	var pointsDelta: Int
	var totalDamageGiven: Long
	var totalDamageTaken: Long
	var winningStreak: Int
}
