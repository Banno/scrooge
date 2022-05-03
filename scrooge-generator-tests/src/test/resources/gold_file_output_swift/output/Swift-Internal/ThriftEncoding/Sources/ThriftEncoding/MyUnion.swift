//
// Automatically @generated by Scrooge
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
import Foundation
import TwitterApacheThrift
enum MyUnion: ThriftCodable, Hashable {
  case unionClassA(UnionClassA)
  case unionClassB(UnionClassB)
  enum CodingKeys: Int, CodingKey {
    case unionClassA = 1
    case unionClassB = 2
  }
  init(unionClassA value: UnionClassA) {
      self = .unionClassA(value)
  }
  init(unionClassB value: UnionClassB) {
      self = .unionClassB(value)
  }
  init(from decoder: Decoder) throws {
      let container = try decoder.container(keyedBy: CodingKeys.self)
      if let decodedClass = try container.decodeIfPresent(UnionClassA.self, forKey: .unionClassA) {
        self = .unionClassA(decodedClass)
      } else if let decodedClass = try container.decodeIfPresent(UnionClassB.self, forKey: .unionClassB) {
        self = .unionClassB(decodedClass)
      } else {
        throw DecodingError.valueNotFound(MyUnion.self, DecodingError.Context(codingPath: decoder.codingPath, debugDescription: "MyUnion not decodable"))
     }
  }
  func encode(to encoder: Encoder) throws {
     var container = encoder.container(keyedBy: CodingKeys.self)
     switch self {
     case .unionClassA(let codedClass):
        try container.encode(codedClass, forKey: .unionClassA)
     case .unionClassB(let codedClass):
        try container.encode(codedClass, forKey: .unionClassB)
     }
  }
}
