require 'asciidoctor-revealjs'

guard 'shell' do
  watch(/^.*\.adoc$/) {|m|
    Asciidoctor.convert_file m[0], backend: 'revealjs'
  }
end