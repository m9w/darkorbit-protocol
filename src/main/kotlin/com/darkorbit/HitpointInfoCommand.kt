package com.darkorbit

interface HitpointInfoCommand : ProtocolPacket {
	var hitpoints: Long
	var hitpointsMax: Long
	var nanoHull: Int
	var nanoHullMax: Int
}
